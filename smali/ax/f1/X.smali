.class public final synthetic Lax/f1/X;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/f1/a0$g;


# instance fields
.field public final synthetic a:Lax/P0/v;


# direct methods
.method public synthetic constructor <init>(Lax/P0/v;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/f1/X;->a:Lax/P0/v;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)I
    .registers 3

    .line 1
    iget-object v0, p0, Lax/f1/X;->a:Lax/P0/v;

    check-cast p1, Lax/f1/D;

    invoke-static {v0, p1}, Lax/f1/a0;->c(Lax/P0/v;Lax/f1/D;)I

    move-result p1

    return p1
.end method

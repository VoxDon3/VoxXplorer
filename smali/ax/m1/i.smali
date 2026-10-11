.class public final synthetic Lax/m1/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/S0/z$c;


# instance fields
.field public final synthetic a:Lax/m1/j;


# direct methods
.method public synthetic constructor <init>(Lax/m1/j;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/m1/i;->a:Lax/m1/j;

    return-void
.end method


# virtual methods
.method public final a(I)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/m1/i;->a:Lax/m1/j;

    invoke-static {v0, p1}, Lax/m1/j;->j(Lax/m1/j;I)V

    return-void
.end method

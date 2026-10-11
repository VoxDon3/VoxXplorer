.class public final synthetic Lax/w5/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/y5/b$a;


# instance fields
.field public final synthetic a:Lax/w5/r;


# direct methods
.method public synthetic constructor <init>(Lax/w5/r;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/w5/o;->a:Lax/w5/r;

    return-void
.end method


# virtual methods
.method public final execute()Ljava/lang/Object;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/w5/o;->a:Lax/w5/r;

    invoke-static {v0}, Lax/w5/r;->c(Lax/w5/r;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
